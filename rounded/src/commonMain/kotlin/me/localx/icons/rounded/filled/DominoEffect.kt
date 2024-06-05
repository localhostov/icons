package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.DominoEffect: ImageVector
    get() {
        if (_dominoEffect != null) {
            return _dominoEffect!!
        }
        _dominoEffect = Builder(name = "DominoEffect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(19.0f, 4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.649f, 4.052f)
                curveToRelative(-0.528f, -0.176f, -1.09f, 0.108f, -1.265f, 0.632f)
                lineToRelative(-4.666f, 14.0f)
                curveToRelative(-0.175f, 0.524f, 0.108f, 1.091f, 0.632f, 1.265f)
                curveToRelative(0.105f, 0.035f, 0.212f, 0.052f, 0.316f, 0.052f)
                curveToRelative(0.419f, 0.0f, 0.809f, -0.265f, 0.948f, -0.684f)
                lineToRelative(4.666f, -14.0f)
                curveToRelative(0.175f, -0.524f, -0.108f, -1.091f, -0.632f, -1.265f)
                close()
                moveTo(7.693f, 11.0f)
                lineToRelative(-1.905f, 5.08f)
                curveToRelative(-0.659f, 1.756f, -2.338f, 2.92f, -4.214f, 2.92f)
                horizontalLineToRelative(-0.575f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.025f, 0.013f, -0.046f, 0.014f, -0.071f)
                curveToRelative(-0.002f, -0.025f, -0.014f, -0.046f, -0.014f, -0.071f)
                curveToRelative(0.0f, -0.233f, 0.071f, -0.46f, 0.204f, -0.651f)
                lineToRelative(2.529f, -3.643f)
                curveToRelative(0.553f, -0.664f, 1.54f, -0.754f, 2.204f, -0.2f)
                curveToRelative(0.664f, 0.553f, 0.754f, 1.54f, 0.2f, 2.204f)
                lineToRelative(-1.137f, 1.434f)
                lineToRelative(7.58f, -0.013f)
                curveToRelative(0.958f, 0.0f, 1.705f, 0.883f, 1.449f, 1.884f)
                curveToRelative(-0.175f, 0.682f, -0.839f, 1.129f, -1.543f, 1.129f)
                horizontalLineToRelative(-3.793f)
                close()
            }
        }
        .build()
        return _dominoEffect!!
    }

private var _dominoEffect: ImageVector? = null
