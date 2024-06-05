package me.localx.icons.rounded.bold

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

public val Icons.Bold.DominoEffect: ImageVector
    get() {
        if (_dominoEffect != null) {
            return _dominoEffect!!
        }
        _dominoEffect = Builder(name = "DominoEffect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.581f, 11.5f)
                lineToRelative(-1.475f, 4.423f)
                curveToRelative(-0.613f, 1.84f, -2.328f, 3.077f, -4.269f, 3.077f)
                horizontalLineToRelative(-0.338f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.338f)
                curveToRelative(0.646f, 0.0f, 1.218f, -0.412f, 1.423f, -1.025f)
                lineToRelative(1.158f, -3.475f)
                lineTo(0.0f, 11.5f)
                verticalLineToRelative(-3.0f)
                lineToRelative(2.733f, -3.937f)
                curveToRelative(0.553f, -0.664f, 1.54f, -0.754f, 2.204f, -0.2f)
                curveToRelative(0.664f, 0.553f, 0.754f, 1.54f, 0.2f, 2.204f)
                lineToRelative(-1.478f, 1.925f)
                lineToRelative(6.841f, -0.004f)
                curveToRelative(0.911f, 0.0f, 1.632f, 0.799f, 1.479f, 1.739f)
                curveToRelative(-0.12f, 0.737f, -0.812f, 1.273f, -1.56f, 1.273f)
                horizontalLineToRelative(-2.839f)
                close()
                moveTo(22.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(20.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.642f, 4.077f)
                curveToRelative(-0.786f, -0.264f, -1.637f, 0.163f, -1.897f, 0.948f)
                lineToRelative(-4.334f, 13.0f)
                curveToRelative(-0.262f, 0.786f, 0.162f, 1.636f, 0.948f, 1.897f)
                curveToRelative(0.157f, 0.053f, 0.317f, 0.077f, 0.475f, 0.077f)
                curveToRelative(0.628f, 0.0f, 1.214f, -0.397f, 1.423f, -1.025f)
                lineToRelative(4.334f, -13.0f)
                curveToRelative(0.262f, -0.786f, -0.162f, -1.636f, -0.948f, -1.897f)
                close()
            }
        }
        .build()
        return _dominoEffect!!
    }

private var _dominoEffect: ImageVector? = null
