package me.localx.icons.rounded.outline

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

public val Icons.Outline.DominoEffect: ImageVector
    get() {
        if (_dominoEffect != null) {
            return _dominoEffect!!
        }
        _dominoEffect = Builder(name = "DominoEffect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.281f, 5.316f)
                lineToRelative(-4.666f, 14.0f)
                curveToRelative(-0.14f, 0.419f, -0.529f, 0.684f, -0.948f, 0.684f)
                curveToRelative(-0.104f, 0.0f, -0.211f, -0.017f, -0.316f, -0.052f)
                curveToRelative(-0.523f, -0.174f, -0.807f, -0.74f, -0.632f, -1.265f)
                lineToRelative(4.666f, -14.0f)
                curveToRelative(0.175f, -0.523f, 0.736f, -0.808f, 1.265f, -0.632f)
                curveToRelative(0.523f, 0.174f, 0.807f, 0.74f, 0.632f, 1.265f)
                close()
                moveTo(13.029f, 9.871f)
                curveToRelative(0.256f, -1.001f, -0.492f, -1.884f, -1.449f, -1.884f)
                lineToRelative(-7.58f, 0.013f)
                lineToRelative(1.137f, -1.434f)
                curveToRelative(0.553f, -0.664f, 0.463f, -1.651f, -0.2f, -2.204f)
                curveToRelative(-0.664f, -0.553f, -1.651f, -0.464f, -2.204f, 0.2f)
                lineTo(0.204f, 8.206f)
                curveToRelative(-0.133f, 0.191f, -0.204f, 0.419f, -0.204f, 0.651f)
                curveToRelative(0.0f, 0.631f, 0.511f, 1.142f, 1.142f, 1.142f)
                horizontalLineToRelative(4.789f)
                lineToRelative(-1.895f, 5.053f)
                curveToRelative(-0.437f, 1.165f, -1.565f, 1.947f, -2.81f, 1.947f)
                horizontalLineToRelative(-0.228f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.228f)
                curveToRelative(2.072f, 0.0f, 3.954f, -1.304f, 4.683f, -3.244f)
                lineToRelative(1.783f, -4.756f)
                horizontalLineToRelative(3.793f)
                curveToRelative(0.704f, 0.0f, 1.368f, -0.447f, 1.543f, -1.129f)
                close()
                moveTo(23.0f, 4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _dominoEffect!!
    }

private var _dominoEffect: ImageVector? = null
