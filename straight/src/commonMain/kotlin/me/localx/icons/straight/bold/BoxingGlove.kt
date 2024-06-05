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

public val Icons.Bold.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = Builder(name = "BoxingGlove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.256f)
                arcTo(7.509f, 7.509f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(7.508f, 7.508f, 0.0f, false, false, 1.0f, 7.5f)
                verticalLineToRelative(6.368f)
                arcToRelative(8.455f, 8.455f, 0.0f, false, false, 1.541f, 4.88f)
                lineTo(4.0f, 20.463f)
                lineTo(4.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 21.622f)
                lineToRelative(2.356f, -2.388f)
                arcTo(8.536f, 8.536f, 0.0f, false, false, 23.0f, 13.075f)
                lineTo(23.0f, 11.5f)
                arcTo(4.508f, 4.508f, 0.0f, false, false, 20.0f, 7.256f)
                close()
                moveTo(20.0f, 13.075f)
                arcToRelative(5.551f, 5.551f, 0.0f, false, true, -1.744f, 4.018f)
                lineTo(16.373f, 19.0f)
                lineTo(6.691f, 19.0f)
                lineTo(4.958f, 16.971f)
                arcTo(5.477f, 5.477f, 0.0f, false, true, 4.0f, 13.868f)
                lineTo(4.0f, 11.743f)
                arcTo(4.488f, 4.488f, 0.0f, false, false, 5.5f, 12.0f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 9.0f)
                lineTo(5.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 7.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 8.5f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, true, 4.493f, 4.259f)
                arcTo(4.509f, 4.509f, 0.0f, false, false, 14.0f, 11.5f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
