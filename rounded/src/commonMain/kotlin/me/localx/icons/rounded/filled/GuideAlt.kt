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

public val Icons.Filled.GuideAlt: ImageVector
    get() {
        if (_guideAlt != null) {
            return _guideAlt!!
        }
        _guideAlt = Builder(name = "GuideAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.395f, 16.061f)
                curveToRelative(-0.87f, 0.104f, -1.696f, 0.437f, -2.395f, 0.964f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.624f, 1.672f, 0.575f, 4.0f, 0.1f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.203f, 0.0f, -0.406f, 0.02f, -0.605f, 0.061f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(0.692f, 0.0f, 1.359f, 0.097f, 2.0f, 0.263f)
                verticalLineToRelative(-5.263f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(4.263f)
                curveToRelative(0.892f, -3.445f, 4.017f, -6.0f, 7.737f, -6.0f)
                close()
                moveTo(10.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(9.726f)
                curveToRelative(-1.667f, -1.467f, -2.726f, -3.61f, -2.726f, -6.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.5f, 15.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _guideAlt!!
    }

private var _guideAlt: ImageVector? = null
