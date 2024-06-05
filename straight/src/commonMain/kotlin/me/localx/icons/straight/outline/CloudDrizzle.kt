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

public val Icons.Outline.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) {
            return _cloudDrizzle!!
        }
        _cloudDrizzle = Builder(name = "CloudDrizzle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(11.0f, 24.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(5.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                close()
                moveTo(17.441f, 5.059f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.265f, 10.05f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 4.0f, 19.792f)
                verticalLineToRelative(-2.13f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.089f, -6.282f)
                lineToRelative(0.8f, -0.408f)
                lineToRelative(-0.319f, -0.838f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 2.0f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 5.752f, 4.289f)
                lineToRelative(0.206f, 0.691f)
                lineTo(16.679f, 7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 20.0f, 16.74f)
                verticalLineToRelative(2.392f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 17.441f, 5.059f)
                close()
            }
        }
        .build()
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
