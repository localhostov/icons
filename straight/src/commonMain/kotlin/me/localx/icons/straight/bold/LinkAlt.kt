package me.localx.icons.straight.bold

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

public val Icons.Bold.LinkAlt: ImageVector
    get() {
        if (_linkAlt != null) {
            return _linkAlt!!
        }
        _linkAlt = Builder(name = "LinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.892f, 17.153f)
                lineToRelative(-0.864f, -0.864f)
                lineToRelative(2.121f, -2.122f)
                lineToRelative(0.864f, 0.864f)
                curveToRelative(1.369f, 1.368f, 3.597f, 1.369f, 4.966f, 0.0f)
                lineToRelative(6.005f, -6.004f)
                curveToRelative(1.369f, -1.369f, 1.369f, -3.597f, 0.0f, -4.966f)
                curveToRelative(-1.195f, -1.195f, -3.042f, -1.378f, -4.403f, -0.489f)
                curveToRelative(-0.974f, -0.38f, -2.022f, -0.58f, -3.1f, -0.58f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.233f, 0.0f, -0.465f, 0.01f, -0.694f, 0.028f)
                lineToRelative(1.112f, -1.112f)
                curveTo(14.167f, 0.638f, 15.834f, 0.003f, 17.502f, 0.003f)
                curveToRelative(1.667f, 0.0f, 3.237f, 0.577f, 4.684f, 2.025f)
                curveToRelative(2.454f, 2.545f, 2.43f, 6.61f, -0.08f, 9.12f)
                lineToRelative(-6.005f, 6.004f)
                curveToRelative(-1.27f, 1.27f, -2.937f, 1.904f, -4.604f, 1.904f)
                reflectiveCurveToRelative(-3.335f, -0.635f, -4.604f, -1.904f)
                close()
                moveTo(1.826f, 21.975f)
                curveToRelative(1.529f, 1.529f, 3.019f, 2.026f, 4.686f, 2.025f)
                curveToRelative(1.667f, 0.0f, 3.334f, -0.635f, 4.602f, -1.904f)
                lineToRelative(1.112f, -1.112f)
                curveToRelative(-0.23f, 0.018f, -0.461f, 0.028f, -0.694f, 0.028f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-1.078f, 0.0f, -2.126f, -0.199f, -3.1f, -0.58f)
                curveToRelative(-1.36f, 0.889f, -3.208f, 0.705f, -4.403f, -0.49f)
                curveToRelative(-1.369f, -1.369f, -1.369f, -3.597f, 0.0f, -4.966f)
                lineToRelative(6.005f, -6.004f)
                curveToRelative(1.369f, -1.369f, 3.597f, -1.369f, 4.966f, 0.0f)
                lineToRelative(0.864f, 0.864f)
                lineToRelative(2.121f, -2.122f)
                lineToRelative(-0.864f, -0.864f)
                curveToRelative(-2.538f, -2.538f, -6.669f, -2.539f, -9.208f, 0.0f)
                lineTo(1.906f, 12.855f)
                curveToRelative(-2.51f, 2.51f, -2.534f, 6.575f, -0.08f, 9.12f)
                close()
            }
        }
        .build()
        return _linkAlt!!
    }

private var _linkAlt: ImageVector? = null
