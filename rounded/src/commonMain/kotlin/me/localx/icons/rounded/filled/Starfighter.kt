package me.localx.icons.rounded.filled

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

public val Icons.Filled.Starfighter: ImageVector
    get() {
        if (_starfighter != null) {
            return _starfighter!!
        }
        _starfighter = Builder(name = "Starfighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                arcToRelative(6.927f, 6.927f, 0.0f, false, false, -3.217f, 0.773f)
                curveTo(10.0f, -1.908f, 14.0f, -1.9f, 15.217f, 5.773f)
                arcTo(6.927f, 6.927f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcTo(5.129f, 5.129f, 0.0f, false, false, 8.388f, 8.5f)
                curveTo(8.011f, 11.851f, 8.0f, 14.932f, 8.0f, 15.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(16.0f, 15.0f)
                curveToRelative(0.0f, -0.068f, -0.011f, -3.149f, -0.388f, -6.5f)
                arcTo(5.129f, 5.129f, 0.0f, false, false, 12.0f, 7.0f)
                close()
                moveTo(23.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(9.414f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 6.0f)
                close()
                moveTo(2.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 7.0f)
                lineTo(0.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(2.0f, 18.0f)
                lineToRelative(4.0f, 5.414f)
                lineTo(6.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                close()
            }
        }
        .build()
        return _starfighter!!
    }

private var _starfighter: ImageVector? = null
