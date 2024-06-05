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

public val Icons.Outline.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.068f, 16.347f)
                lineToRelative(4.9f, 4.9f)
                lineToRelative(0.707f, -0.707f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, false, 2.075f, -7.619f)
                lineToRelative(-0.246f, -1.0f)
                lineToRelative(2.086f, -2.086f)
                lineToRelative(0.217f, 0.217f)
                arcToRelative(3.085f, 3.085f, 0.0f, false, false, 3.938f, 0.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.38f, -4.565f)
                lineTo(18.2f, 0.954f)
                arcToRelative(3.085f, 3.085f, 0.0f, false, false, -3.938f, -0.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.38f, 4.565f)
                lineToRelative(0.293f, 0.293f)
                lineTo(12.085f, 7.5f)
                lineTo(11.1f, 7.258f)
                arcTo(7.985f, 7.985f, 0.0f, false, false, 3.464f, 9.33f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.9f, 4.895f)
                lineTo(0.293f, 22.293f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(10.607f, 9.2f)
                lineToRelative(2.1f, 0.514f)
                lineToRelative(4.3f, -4.3f)
                lineTo(15.293f, 3.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.134f, -1.528f)
                arcToRelative(1.084f, 1.084f, 0.0f, false, true, 1.356f, 0.19f)
                lineToRelative(4.924f, 4.924f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.134f, 1.528f)
                arcToRelative(1.084f, 1.084f, 0.0f, false, true, -1.356f, -0.19f)
                lineTo(18.586f, 7.0f)
                lineToRelative(-4.3f, 4.3f)
                lineToRelative(0.518f, 2.111f)
                arcToRelative(5.977f, 5.977f, 0.0f, false, true, -0.9f, 4.946f)
                lineTo(5.646f, 10.1f)
                arcTo(5.986f, 5.986f, 0.0f, false, true, 10.607f, 9.2f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
