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

public val Icons.Bold.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 8.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 20.5f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(13.975f, 21.0f)
                curveToRelative(0.015f, -0.165f, 0.025f, -0.331f, 0.025f, -0.5f)
                arcTo(5.474f, 5.474f, 0.0f, false, false, 13.4f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.1f)
                arcTo(5.474f, 5.474f, 0.0f, false, false, 3.0f, 20.5f)
                curveToRelative(0.0f, 0.153f, 0.011f, 0.3f, 0.023f, 0.452f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.0f, 17.5f)
                lineTo(0.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 23.0f, 3.5f)
                lineTo(23.0f, 18.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(20.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(3.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null
