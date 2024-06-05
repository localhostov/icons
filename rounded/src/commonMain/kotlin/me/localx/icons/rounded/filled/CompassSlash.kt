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

public val Icons.Filled.CompassSlash: ImageVector
    get() {
        if (_compassSlash != null) {
            return _compassSlash!!
        }
        _compassSlash = Builder(name = "CompassSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.485f, 22.213f)
                curveToRelative(-0.058f, 0.327f, -0.273f, 0.604f, -0.576f, 0.739f)
                curveToRelative(-1.548f, 0.695f, -3.199f, 1.047f, -4.909f, 1.047f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.71f, 0.353f, -3.362f, 1.048f, -4.91f)
                curveToRelative(0.135f, -0.3f, 0.408f, -0.514f, 0.73f, -0.574f)
                curveToRelative(0.323f, -0.06f, 0.655f, 0.042f, 0.888f, 0.275f)
                lineToRelative(5.468f, 5.456f)
                lineToRelative(-1.905f, 3.29f)
                curveToRelative(-0.839f, 1.448f, 0.784f, 3.071f, 2.233f, 2.233f)
                lineToRelative(3.294f, -1.907f)
                curveToRelative(5.803f, 5.799f, 5.815f, 5.861f, 5.729f, 6.35f)
                close()
                moveTo(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.553f, 2.553f)
                curveTo(6.425f, 1.013f, 9.143f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.853f, -1.014f, 5.574f, -2.846f, 7.74f)
                lineToRelative(2.553f, 2.553f)
                close()
                moveTo(11.401f, 8.208f)
                curveToRelative(-0.568f, 0.329f, -0.67f, 1.108f, -0.206f, 1.572f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.32f, 0.32f, 0.816f, 0.385f, 1.208f, 0.158f)
                lineToRelative(3.291f, -1.905f)
                curveToRelative(0.039f, -0.023f, 0.132f, -0.079f, 0.241f, 0.032f)
                curveToRelative(0.108f, 0.108f, 0.055f, 0.201f, 0.031f, 0.241f)
                lineToRelative(-1.905f, 3.291f)
                curveToRelative(-0.227f, 0.392f, -0.162f, 0.888f, 0.158f, 1.208f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.465f, 0.465f, 1.243f, 0.362f, 1.572f, -0.206f)
                lineToRelative(1.845f, -3.186f)
                curveToRelative(0.488f, -0.842f, 0.453f, -1.934f, -0.194f, -2.662f)
                curveToRelative(-0.712f, -0.8f, -1.836f, -0.977f, -2.751f, -0.448f)
                lineToRelative(-3.291f, 1.905f)
                close()
            }
        }
        .build()
        return _compassSlash!!
    }

private var _compassSlash: ImageVector? = null
