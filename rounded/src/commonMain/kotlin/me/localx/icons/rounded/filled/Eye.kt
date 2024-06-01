package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 15.9985f)
                curveTo(14.2082f, 15.9985f, 15.9984f, 14.2083f, 15.9984f, 12.0f)
                curveTo(15.9984f, 9.7916f, 14.2082f, 8.0015f, 11.9999f, 8.0015f)
                curveTo(9.7916f, 8.0015f, 8.0014f, 9.7916f, 8.0014f, 12.0f)
                curveTo(8.0014f, 14.2083f, 9.7916f, 15.9985f, 11.9999f, 15.9985f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2668f, 9.4201f)
                curveTo(21.7164f, 6.895f, 18.1897f, 2.6586f, 12.0f, 2.6586f)
                curveTo(5.8103f, 2.6586f, 2.2836f, 6.895f, 0.7332f, 9.4201f)
                curveTo(-0.2444f, 11.0012f, -0.2444f, 12.999f, 0.7332f, 14.5802f)
                curveTo(2.2836f, 17.1052f, 5.8103f, 21.3417f, 12.0f, 21.3417f)
                curveTo(18.1897f, 21.3417f, 21.7164f, 17.1052f, 23.2668f, 14.5802f)
                curveTo(24.2444f, 12.999f, 24.2444f, 11.0012f, 23.2668f, 9.4201f)
                close()
                moveTo(12.0f, 17.9979f)
                curveTo(8.6875f, 17.9979f, 6.0022f, 15.3126f, 6.0022f, 12.0001f)
                curveTo(6.0022f, 8.6876f, 8.6875f, 6.0023f, 12.0f, 6.0023f)
                curveTo(15.3125f, 6.0023f, 17.9978f, 8.6876f, 17.9978f, 12.0001f)
                curveTo(17.9945f, 15.3112f, 15.3111f, 17.9945f, 12.0f, 17.9979f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
