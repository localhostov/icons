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

public val Icons.Outline.CloudShowers: ImageVector
    get() {
        if (_cloudShowers != null) {
            return _cloudShowers!!
        }
        _cloudShowers = Builder(name = "CloudShowers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 24.0f)
                close()
                moveTo(19.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.441f, 5.059f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.265f, 10.05f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 3.0f, 19.4f)
                lineTo(3.0f, 16.946f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.911f, -5.566f)
                lineToRelative(0.8f, -0.408f)
                lineToRelative(-0.319f, -0.838f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 2.0f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 5.752f, 4.289f)
                lineToRelative(0.206f, 0.691f)
                lineTo(16.679f, 7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 21.0f, 15.659f)
                lineTo(21.0f, 18.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 17.441f, 5.059f)
                close()
            }
        }
        .build()
        return _cloudShowers!!
    }

private var _cloudShowers: ImageVector? = null
