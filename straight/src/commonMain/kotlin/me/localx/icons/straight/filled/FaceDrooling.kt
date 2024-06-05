package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.FaceDrooling: ImageVector
    get() {
        if (_faceDrooling != null) {
            return _faceDrooling!!
        }
        _faceDrooling = Builder(name = "FaceDrooling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.129f, 0.183f)
                curveTo(6.022f, -1.21f, -0.933f, 5.54f, 0.103f, 13.592f)
                curveToRelative(0.617f, 4.793f, 4.205f, 8.8f, 8.881f, 10.017f)
                curveToRelative(2.508f, 0.653f, 4.891f, 0.446f, 7.016f, -0.306f)
                verticalLineToRelative(-6.236f)
                curveToRelative(-0.556f, 0.256f, -1.241f, 0.504f, -2.0f, 0.683f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-3.107f, 0.0f, -5.563f, -2.162f, -5.666f, -2.254f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.02f, 0.017f, 2.005f, 1.747f, 4.336f, 1.747f)
                curveToRelative(2.384f, 0.0f, 4.391f, -1.435f, 4.411f, -1.449f)
                lineToRelative(1.586f, -1.149f)
                lineToRelative(0.002f, 8.98f)
                curveToRelative(4.143f, -2.4f, 6.726f, -7.193f, 5.819f, -12.498f)
                curveTo(22.979f, 4.979f, 19.033f, 1.026f, 14.129f, 0.183f)
                close()
                moveTo(6.845f, 11.535f)
                lineToRelative(-1.689f, -1.07f)
                curveToRelative(0.912f, -1.438f, 2.279f, -2.576f, 3.953f, -3.29f)
                lineToRelative(0.784f, 1.84f)
                curveToRelative(-1.282f, 0.546f, -2.364f, 1.441f, -3.048f, 2.521f)
                close()
                moveTo(17.156f, 11.535f)
                curveToRelative(-0.684f, -1.079f, -1.766f, -1.975f, -3.048f, -2.521f)
                lineToRelative(0.784f, -1.84f)
                curveToRelative(1.674f, 0.714f, 3.042f, 1.852f, 3.953f, 3.29f)
                lineToRelative(-1.689f, 1.07f)
                close()
            }
        }
        .build()
        return _faceDrooling!!
    }

private var _faceDrooling: ImageVector? = null
