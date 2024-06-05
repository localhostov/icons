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

public val Icons.Bold.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(3.462f, 0.0f, 1.0f, 2.462f, 1.0f, 5.5f)
                verticalLineToRelative(14.303f)
                curveToRelative(0.159f, 2.338f, 2.122f, 4.197f, 4.5f, 4.197f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                lineTo(7.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.529f, 0.0f, -1.029f, 0.108f, -1.5f, 0.276f)
                lineTo(4.0f, 5.5f)
                close()
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.972f, -0.035f, -1.97f, -2.965f, 0.0f, -3.0f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(20.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.348f)
                curveToRelative(0.0f, 0.623f, 0.791f, 0.89f, 1.169f, 0.395f)
                lineToRelative(1.331f, -1.743f)
                lineToRelative(1.331f, 1.743f)
                curveToRelative(0.378f, 0.495f, 1.169f, 0.228f, 1.169f, -0.395f)
                lineTo(18.0f, 3.051f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.449f)
                lineTo(20.0f, 15.0f)
                close()
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
