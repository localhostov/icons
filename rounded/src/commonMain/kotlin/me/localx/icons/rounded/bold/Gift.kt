package me.localx.icons.rounded.bold

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

public val Icons.Bold.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 7.0f)
                horizontalLineToRelative(-0.591f)
                arcTo(5.81f, 5.81f, 0.0f, false, false, 20.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 2.17f, -1.824f, 2.993f, -3.279f, 3.307f)
                arcTo(8.617f, 8.617f, 0.0f, false, false, 15.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                arcToRelative(8.617f, 8.617f, 0.0f, false, false, 1.279f, 3.807f)
                curveTo(8.824f, 6.493f, 7.0f, 5.67f, 7.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcTo(5.81f, 5.81f, 0.0f, false, false, 5.091f, 7.0f)
                lineTo(4.5f, 7.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 11.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.449f)
                verticalLineToRelative(3.733f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 7.318f, 24.0f)
                horizontalLineToRelative(9.364f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 22.0f, 18.682f)
                lineTo(22.0f, 14.949f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 7.0f)
                close()
                moveTo(21.0f, 11.5f)
                lineTo(21.0f, 12.0f)
                lineTo(13.5f, 12.0f)
                lineTo(13.5f, 10.0f)
                horizontalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 11.5f)
                close()
                moveTo(3.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(5.0f, 18.682f)
                lineTo(5.0f, 15.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                lineTo(7.318f, 21.0f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 5.0f, 18.682f)
                close()
                moveTo(16.682f, 21.0f)
                lineTo(13.5f, 21.0f)
                lineTo(13.5f, 15.0f)
                lineTo(19.0f, 15.0f)
                verticalLineToRelative(3.682f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 16.682f, 21.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
