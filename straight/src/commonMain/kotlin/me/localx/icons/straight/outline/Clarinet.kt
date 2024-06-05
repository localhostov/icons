package me.localx.icons.straight.outline

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

public val Icons.Outline.Clarinet: ImageVector
    get() {
        if (_clarinet != null) {
            return _clarinet!!
        }
        _clarinet = Builder(name = "Clarinet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.999f, 5.136f)
                lineToRelative(-1.553f, 1.031f)
                curveToRelative(-0.028f, 0.019f, -2.784f, 1.833f, -4.946f, 1.833f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.217f)
                curveToRelative(-2.177f, 0.422f, -4.279f, 1.315f, -4.394f, 1.364f)
                lineToRelative(-0.606f, 0.26f)
                verticalLineToRelative(5.277f)
                lineToRelative(0.553f, 0.276f)
                curveToRelative(0.131f, 0.065f, 3.248f, 1.605f, 6.447f, 1.605f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.162f, 0.0f, 4.918f, 1.814f, 4.946f, 1.833f)
                lineToRelative(1.554f, 1.031f)
                lineTo(24.0f, 5.136f)
                close()
                moveTo(21.999f, 16.283f)
                curveToRelative(-1.198f, -0.6f, -2.911f, -1.283f, -4.5f, -1.283f)
                lineTo(7.0f, 15.0f)
                curveToRelative(-1.998f, 0.0f, -4.045f, -0.746f, -5.0f, -1.147f)
                verticalLineToRelative(-2.674f)
                curveToRelative(1.066f, -0.405f, 3.322f, -1.179f, 5.0f, -1.179f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.589f, 0.0f, 3.302f, -0.684f, 4.5f, -1.283f)
                verticalLineToRelative(7.566f)
                close()
                moveTo(12.999f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(7.999f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(16.499f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _clarinet!!
    }

private var _clarinet: ImageVector? = null
