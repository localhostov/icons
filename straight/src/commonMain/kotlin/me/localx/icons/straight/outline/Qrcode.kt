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

public val Icons.Outline.Qrcode: ImageVector
    get() {
        if (_qrcode != null) {
            return _qrcode!!
        }
        _qrcode = Builder(name = "Qrcode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 11.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 7.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(24.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(0.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _qrcode!!
    }

private var _qrcode: ImageVector? = null
