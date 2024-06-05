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

public val Icons.Outline.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = Builder(name = "DoorOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-0.535f)
                curveToRelative(-0.238f, -0.411f, -0.55f, -0.782f, -0.929f, -1.092f)
                curveTo(13.606f, 0.146f, 12.396f, -0.157f, 11.216f, 0.079f)
                lineToRelative(-3.197f, 0.639f)
                curveToRelative(-2.329f, 0.466f, -4.019f, 2.528f, -4.019f, 4.903f)
                lineTo(4.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 24.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                lineTo(18.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(6.0f, 5.621f)
                curveToRelative(0.0f, -1.426f, 1.014f, -2.663f, 2.411f, -2.942f)
                lineToRelative(3.196f, -0.639f)
                curveToRelative(0.59f, -0.119f, 1.195f, 0.033f, 1.661f, 0.415f)
                curveToRelative(0.465f, 0.381f, 0.731f, 0.944f, 0.731f, 1.546f)
                lineTo(13.999f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 5.621f)
                close()
                moveTo(12.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
