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

public val Icons.Filled.WaterBottle: ImageVector
    get() {
        if (_waterBottle != null) {
            return _waterBottle!!
        }
        _waterBottle = Builder(name = "WaterBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, 0.78f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.78f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 4.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -0.78f, -2.0f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 20.0f, 16.0f)
                verticalLineTo(13.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -0.78f, -2.0f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 20.0f, 9.0f)
                verticalLineTo(8.031f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, -1.886f, -2.785f)
                lineTo(15.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                lineTo(5.885f, 5.246f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 4.0f, 8.031f)
                verticalLineTo(8.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, 0.78f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.78f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _waterBottle!!
    }

private var _waterBottle: ImageVector? = null
