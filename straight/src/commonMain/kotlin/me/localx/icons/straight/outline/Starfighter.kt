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
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(8.0f)
                lineTo(15.983f, 14.0f)
                curveTo(15.7f, -4.73f, 8.3f, -4.671f, 8.017f, 14.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                lineTo(2.0f, 19.174f)
                lineTo(7.63f, 24.0f)
                lineTo(10.0f, 24.0f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.424f)
                lineTo(22.0f, 19.185f)
                lineTo(22.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 6.0f)
                close()
                moveTo(13.046f, 5.151f)
                arcToRelative(4.379f, 4.379f, 0.0f, false, false, -2.092f, 0.0f)
                arcTo(8.567f, 8.567f, 0.0f, false, true, 12.0f, 2.093f)
                arcTo(8.567f, 8.567f, 0.0f, false, true, 13.046f, 5.151f)
                close()
                moveTo(8.0f, 21.683f)
                lineTo(2.0f, 16.54f)
                lineTo(2.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(10.0f, 20.0f)
                lineTo(10.0f, 15.0f)
                arcToRelative(53.685f, 53.685f, 0.0f, false, true, 0.536f, -7.473f)
                arcToRelative(2.274f, 2.274f, 0.0f, false, true, 2.928f, 0.0f)
                arcTo(53.685f, 53.685f, 0.0f, false, true, 14.0f, 15.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 21.724f)
                lineTo(16.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.543f)
                close()
            }
        }
        .build()
        return _starfighter!!
    }

private var _starfighter: ImageVector? = null
