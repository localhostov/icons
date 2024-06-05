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

public val Icons.Bold.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.566f, 7.423f)
                curveTo(23.812f, 6.042f, 24.0f, 3.63f, 24.0f, 2.0f)
                lineTo(19.576f, 2.0f)
                arcTo(4.95f, 4.95f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, 0.424f, 2.0f)
                lineTo(0.0f, 2.0f)
                curveTo(0.0f, 3.57f, 0.178f, 5.648f, 1.3f, 6.9f)
                lineTo(5.031f, 21.808f)
                arcTo(2.492f, 2.492f, 0.0f, false, false, 7.5f, 24.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, false, 2.469f, -2.192f)
                close()
                moveTo(16.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.5f, 14.5f)
                arcToRelative(4.482f, 4.482f, 0.0f, false, true, 1.28f, -3.133f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.646f, -1.309f)
                arcTo(4.36f, 4.36f, 0.0f, false, true, 18.0f, 10.0f)
                horizontalLineToRelative(0.829f)
                lineToRelative(-2.252f, 9.008f)
                curveTo(16.551f, 19.007f, 16.526f, 19.0f, 16.5f, 19.0f)
                close()
                moveTo(7.423f, 19.008f)
                lineTo(5.171f, 10.0f)
                lineTo(6.0f, 10.0f)
                arcToRelative(4.36f, 4.36f, 0.0f, false, true, 0.574f, 0.058f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.22f, 11.367f)
                arcTo(4.482f, 4.482f, 0.0f, false, true, 10.5f, 14.5f)
                lineTo(10.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(7.474f, 19.0f, 7.449f, 19.007f, 7.423f, 19.008f)
                close()
                moveTo(15.0f, 5.0f)
                arcToRelative(4.927f, 4.927f, 0.0f, false, false, 0.89f, -0.09f)
                arcTo(14.344f, 14.344f, 0.0f, false, true, 18.223f, 7.0f)
                lineTo(18.0f, 7.0f)
                arcToRelative(7.486f, 7.486f, 0.0f, false, false, -6.0f, 3.019f)
                arcTo(7.486f, 7.486f, 0.0f, false, false, 6.0f, 7.0f)
                lineTo(5.777f, 7.0f)
                arcTo(14.344f, 14.344f, 0.0f, false, true, 8.11f, 4.91f)
                arcTo(4.927f, 4.927f, 0.0f, false, false, 9.0f, 5.0f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
