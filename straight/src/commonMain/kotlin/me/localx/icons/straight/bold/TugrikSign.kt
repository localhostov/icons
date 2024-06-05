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

public val Icons.Bold.TugrikSign: ImageVector
    get() {
        if (_tugrikSign != null) {
            return _tugrikSign!!
        }
        _tugrikSign = Builder(name = "TugrikSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 3.0f)
                verticalLineToRelative(5.66f)
                lineToRelative(6.5f, -2.17f)
                verticalLineToRelative(3.17f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(2.33f)
                lineToRelative(6.5f, -2.17f)
                verticalLineToRelative(3.17f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(6.67f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.67f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(-3.17f)
                lineToRelative(6.5f, -2.17f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(-3.17f)
                lineToRelative(6.5f, -2.17f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _tugrikSign!!
    }

private var _tugrikSign: ImageVector? = null
