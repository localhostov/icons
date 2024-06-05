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

public val Icons.Bold.FonduePot: ImageVector
    get() {
        if (_fonduePot != null) {
            return _fonduePot!!
        }
        _fonduePot = Builder(name = "FonduePot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 7.0f)
                horizontalLineToRelative(-1.934f)
                lineToRelative(2.223f, -3.732f)
                curveToRelative(0.424f, -0.711f, 0.19f, -1.632f, -0.521f, -2.056f)
                curveToRelative(-0.709f, -0.424f, -1.632f, -0.191f, -2.057f, 0.521f)
                lineToRelative(-3.138f, 5.268f)
                horizontalLineToRelative(-2.206f)
                lineToRelative(1.187f, -5.164f)
                curveToRelative(0.186f, -0.808f, -0.318f, -1.612f, -1.126f, -1.798f)
                curveToRelative(-0.808f, -0.185f, -1.612f, 0.319f, -1.798f, 1.126f)
                lineToRelative(-1.341f, 5.836f)
                horizontalLineToRelative(-4.862f)
                lineTo(3.789f, 1.732f)
                curveToRelative(-0.424f, -0.712f, -1.346f, -0.946f, -2.056f, -0.521f)
                curveToRelative(-0.712f, 0.424f, -0.945f, 1.345f, -0.521f, 2.056f)
                lineToRelative(2.224f, 3.732f)
                horizontalLineToRelative(-1.935f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 2.76f, 1.323f, 5.218f, 3.369f, 6.771f)
                curveToRelative(-0.844f, 0.818f, -1.369f, 1.963f, -1.369f, 3.229f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.265f, -0.525f, -2.41f, -1.369f, -3.229f)
                curveToRelative(2.045f, -1.554f, 3.369f, -4.011f, 3.369f, -6.771f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 12.5f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _fonduePot!!
    }

private var _fonduePot: ImageVector? = null
