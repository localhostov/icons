package me.localx.icons.straight.filled

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

public val Icons.Filled.HandBackPointRibbon: ImageVector
    get() {
        if (_handBackPointRibbon != null) {
            return _handBackPointRibbon!!
        }
        _handBackPointRibbon = Builder(name = "HandBackPointRibbon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.991f, 2.0f)
                horizontalLineToRelative(-3.991f)
                curveTo(8.0f, 0.785f, 9.083f, -0.176f, 10.336f, 0.027f)
                curveToRelative(0.948f, 0.154f, 1.608f, 1.018f, 1.655f, 1.973f)
                close()
                moveTo(22.0f, 10.865f)
                lineToRelative(-10.0f, -1.865f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.435f)
                lineToRelative(-3.121f, 3.071f)
                curveToRelative(-1.134f, 1.134f, -1.134f, 3.11f, 0.0f, 4.243f)
                lineToRelative(5.121f, 5.122f)
                horizontalLineToRelative(14.0f)
                lineTo(22.0f, 10.865f)
                close()
                moveTo(12.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 4.0f)
                lineToRelative(2.0f, 1.5f)
                lineToRelative(-2.0f, 1.5f)
                lineTo(12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _handBackPointRibbon!!
    }

private var _handBackPointRibbon: ImageVector? = null
