package me.localx.icons.rounded.outline

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

public val Icons.Outline.Starfighter: ImageVector
    get() {
        if (_starfighter != null) {
            return _starfighter!!
        }
        _starfighter = Builder(name = "Starfighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                lineTo(15.983f, 14.0f)
                curveTo(15.7f, -4.73f, 8.3f, -4.671f, 8.017f, 14.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 7.0f)
                lineTo(0.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.586f)
                lineToRelative(3.878f, 3.878f)
                arcTo(2.433f, 2.433f, 0.0f, false, false, 9.965f, 22.0f)
                horizontalLineToRelative(4.07f)
                arcToRelative(2.433f, 2.433f, 0.0f, false, false, 4.086f, 1.293f)
                lineTo(22.0f, 19.414f)
                lineTo(22.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(24.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 6.0f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(53.685f, 53.685f, 0.0f, false, true, 0.536f, -7.473f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, true, 2.928f, 0.0f)
                arcTo(53.685f, 53.685f, 0.0f, false, true, 14.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(10.0f, 20.0f)
                close()
                moveTo(13.046f, 5.151f)
                arcToRelative(4.379f, 4.379f, 0.0f, false, false, -2.092f, 0.0f)
                arcTo(8.567f, 8.567f, 0.0f, false, true, 12.0f, 2.093f)
                arcTo(8.567f, 8.567f, 0.0f, false, true, 13.046f, 5.151f)
                close()
                moveTo(8.0f, 21.586f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, true, -0.707f, 0.293f)
                lineTo(2.0f, 16.586f)
                lineTo(2.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(16.706f, 21.879f)
                arcTo(0.43f, 0.43f, 0.0f, false, true, 16.0f, 21.586f)
                lineTo(16.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.586f)
                close()
            }
        }
        .build()
        return _starfighter!!
    }

private var _starfighter: ImageVector? = null
