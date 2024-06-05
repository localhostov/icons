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

public val Icons.Outline.WaterBottle: ImageVector
    get() {
        if (_waterBottle != null) {
            return _waterBottle!!
        }
        _waterBottle = Builder(name = "WaterBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.989f)
                arcTo(3.981f, 3.981f, 0.0f, false, false, 17.485f, 4.3f)
                lineTo(15.0f, 3.307f)
                lineTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(9.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 2.0f)
                lineTo(9.0f, 3.307f)
                lineTo(6.514f, 4.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.383f, 11.0f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, 2.618f, -7.0f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.0f, -6.0f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 20.0f, 7.989f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 20.0f)
                close()
                moveTo(18.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 14.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.743f, -3.841f)
                lineToRelative(3.114f, -1.246f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 3.984f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.984f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.629f, 0.929f)
                lineToRelative(3.113f, 1.245f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _waterBottle!!
    }

private var _waterBottle: ImageVector? = null
