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

public val Icons.Outline.Cars: ImageVector
    get() {
        if (_cars != null) {
            return _cars!!
        }
        _cars = Builder(name = "Cars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.079f)
                arcToRelative(12.978f, 12.978f, 0.0f, false, false, -0.757f, -4.373f)
                lineToRelative(-0.853f, -2.388f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 17.681f, 8.0f)
                lineTo(13.319f, 8.0f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 8.61f, 11.318f)
                lineToRelative(-0.853f, 2.388f)
                curveTo(6.9f, 16.223f, 6.209f, 20.0f, 9.0f, 21.5f)
                lineTo(9.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcTo(3.923f, 3.923f, 0.0f, false, false, 24.0f, 18.079f)
                close()
                moveTo(13.319f, 10.0f)
                horizontalLineToRelative(4.362f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 2.825f, 1.991f)
                lineTo(21.224f, 14.0f)
                lineTo(9.776f, 14.0f)
                lineToRelative(0.718f, -2.009f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 13.319f, 10.0f)
                close()
                moveTo(20.079f, 20.0f)
                lineTo(10.921f, 20.0f)
                curveTo(8.749f, 19.949f, 8.84f, 17.569f, 9.2f, 16.0f)
                lineTo(11.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(1.8f)
                curveTo(22.16f, 17.569f, 22.25f, 19.95f, 20.079f, 20.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(4.0f, 8.0f)
                lineTo(2.2f, 8.0f)
                curveToRelative(-0.358f, 1.569f, -0.448f, 3.95f, 1.723f, 4.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                curveTo(-0.792f, 11.994f, -0.1f, 8.225f, 0.757f, 5.706f)
                lineTo(1.61f, 3.318f)
                arcTo(5.01f, 5.01f, 0.0f, false, true, 6.319f, 0.0f)
                horizontalLineToRelative(4.362f)
                arcTo(5.01f, 5.01f, 0.0f, false, true, 15.39f, 3.318f)
                lineToRelative(0.481f, 1.346f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.884f, 0.672f)
                lineToRelative(-0.481f, -1.345f)
                arcTo(3.005f, 3.005f, 0.0f, false, false, 10.681f, 2.0f)
                lineTo(6.319f, 2.0f)
                arcTo(3.005f, 3.005f, 0.0f, false, false, 3.494f, 3.991f)
                lineTo(2.776f, 6.0f)
                lineTo(8.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                lineTo(6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cars!!
    }

private var _cars: ImageVector? = null
