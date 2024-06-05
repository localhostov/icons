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

public val Icons.Bold.WaterBottle: ImageVector
    get() {
        if (_waterBottle != null) {
            return _waterBottle!!
        }
        _waterBottle = Builder(name = "WaterBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.386f)
                arcToRelative(3.516f, 3.516f, 0.0f, false, false, -2.271f, -3.277f)
                lineTo(16.0f, 3.46f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(0.46f)
                lineToRelative(-1.729f, 0.649f)
                arcTo(3.516f, 3.516f, 0.0f, false, false, 4.0f, 7.386f)
                lineTo(4.0f, 8.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 0.635f, 2.0f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 4.0f, 12.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 0.635f, 2.0f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 4.0f, 18.5f)
                lineTo(4.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 18.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -0.635f, -2.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 0.635f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -0.635f, -2.0f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 20.0f, 8.5f)
                close()
                moveTo(7.0f, 7.386f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, true, 0.324f, -0.469f)
                lineTo(11.0f, 5.54f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.54f)
                lineToRelative(3.675f, 1.377f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 17.0f, 7.386f)
                lineTo(17.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 8.5f)
                close()
                moveTo(17.0f, 12.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 17.0f, 12.5f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _waterBottle!!
    }

private var _waterBottle: ImageVector? = null
