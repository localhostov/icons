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

public val Icons.Outline.GrinBeamSweat: ImageVector
    get() {
        if (_grinBeamSweat != null) {
            return _grinBeamSweat!!
        }
        _grinBeamSweat = Builder(name = "GrinBeamSweat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(13.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveTo(18.752f, 5.715f, 13.247f, 5.718f, 13.0f, 11.0f)
                close()
                moveTo(20.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 23.0f, 4.5f)
                curveToRelative(0.072f, -1.083f, -1.837f, -5.626f, -3.073f, -4.231f)
                arcTo(8.374f, 8.374f, 0.0f, false, false, 18.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 7.0f)
                close()
                moveTo(23.679f, 9.229f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.948f, 0.459f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -6.242f, -7.063f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.7f, -1.874f)
                curveTo(8.571f, -2.229f, -0.153f, 3.8f, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 23.679f, 9.229f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.053f, -1.518f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _grinBeamSweat!!
    }

private var _grinBeamSweat: ImageVector? = null
