package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = Builder(name = "ZoomIn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 481.894f)
                lineTo(378.671f, 348.565f)
                curveToRelative(74.553f, -91.18f, 61.074f, -225.533f, -30.106f, -300.086f)
                reflectiveCurveTo(123.032f, -12.595f, 48.479f, 78.586f)
                reflectiveCurveToRelative(-61.074f, 225.533f, 30.106f, 300.086f)
                curveToRelative(78.538f, 64.216f, 191.442f, 64.216f, 269.979f, 0.0f)
                lineTo(481.894f, 512.0f)
                lineTo(512.0f, 481.894f)
                close()
                moveTo(213.916f, 384.25f)
                curveToRelative(-94.073f, 0.0f, -170.334f, -76.261f, -170.334f, -170.334f)
                reflectiveCurveTo(119.843f, 43.582f, 213.916f, 43.582f)
                reflectiveCurveTo(384.25f, 119.843f, 384.25f, 213.916f)
                curveTo(384.144f, 307.945f, 307.945f, 384.144f, 213.916f, 384.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.208f, 128.749f)
                lineToRelative(-42.584f, 0.0f)
                lineToRelative(0.0f, 63.875f)
                lineToRelative(-63.875f, 0.0f)
                lineToRelative(0.0f, 42.584f)
                lineToRelative(63.875f, 0.0f)
                lineToRelative(0.0f, 63.875f)
                lineToRelative(42.584f, 0.0f)
                lineToRelative(0.0f, -63.875f)
                lineToRelative(63.875f, 0.0f)
                lineToRelative(0.0f, -42.584f)
                lineToRelative(-63.875f, 0.0f)
                close()
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
