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

public val Icons.Outline.RectangleHorizontal: ImageVector
    get() {
        if (_rectangleHorizontal != null) {
            return _rectangleHorizontal!!
        }
        _rectangleHorizontal = Builder(name = "RectangleHorizontal", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(2.0f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _rectangleHorizontal!!
    }

private var _rectangleHorizontal: ImageVector? = null
