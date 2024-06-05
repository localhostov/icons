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

public val Icons.Outline.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.89f, 481.79f)
                lineToRelative(-133.3f, -133.3f)
                curveToRelative(74.537f, -91.16f, 61.06f, -225.485f, -30.1f, -300.021f)
                reflectiveCurveToRelative(-225.485f, -61.06f, -300.021f, 30.1f)
                reflectiveCurveToRelative(-61.06f, 225.485f, 30.1f, 300.021f)
                curveToRelative(78.521f, 64.202f, 191.401f, 64.202f, 269.921f, 0.0f)
                lineToRelative(133.3f, 133.3f)
                lineTo(511.89f, 481.79f)
                close()
                moveTo(213.87f, 384.167f)
                curveToRelative(-94.053f, 0.0f, -170.297f, -76.245f, -170.297f, -170.297f)
                reflectiveCurveTo(119.817f, 43.573f, 213.87f, 43.573f)
                reflectiveCurveToRelative(170.297f, 76.245f, 170.297f, 170.297f)
                curveTo(384.062f, 307.879f, 307.879f, 384.062f, 213.87f, 384.167f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.721f, 192.583f)
                horizontalLineToRelative(170.297f)
                verticalLineToRelative(42.574f)
                horizontalLineToRelative(-170.297f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
