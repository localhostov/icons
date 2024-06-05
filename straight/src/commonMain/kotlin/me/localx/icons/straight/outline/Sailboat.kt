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

public val Icons.Outline.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(-0.004f, 15.0f)
                lineToRelative(0.147f, 1.129f)
                curveToRelative(0.01f, 0.079f, 1.129f, 7.871f, 10.071f, 7.871f)
                horizontalLineToRelative(3.53f)
                curveToRelative(8.936f, 0.0f, 10.11f, -7.785f, 10.121f, -7.863f)
                lineToRelative(0.157f, -1.137f)
                lineTo(-0.004f, 15.0f)
                close()
                moveTo(13.744f, 22.0f)
                horizontalLineToRelative(-3.53f)
                curveToRelative(-5.298f, 0.0f, -7.166f, -3.226f, -7.792f, -5.0f)
                horizontalLineToRelative(19.156f)
                curveToRelative(-0.643f, 1.779f, -2.538f, 5.0f, -7.834f, 5.0f)
                close()
                moveTo(12.009f, 0.019f)
                lineToRelative(-0.009f, 12.981f)
                horizontalLineToRelative(11.975f)
                lineTo(12.009f, 0.019f)
                close()
                moveTo(14.005f, 5.136f)
                lineToRelative(5.405f, 5.864f)
                horizontalLineToRelative(-5.409f)
                lineToRelative(0.004f, -5.864f)
                close()
                moveTo(10.0f, 1.865f)
                lineTo(0.127f, 13.0f)
                horizontalLineToRelative(9.873f)
                lineTo(10.0f, 1.865f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(-3.427f)
                lineToRelative(3.427f, -3.865f)
                verticalLineToRelative(3.865f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
