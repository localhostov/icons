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

public val Icons.Outline.TugrikSign: ImageVector
    get() {
        if (_tugrikSign != null) {
            return _tugrikSign!!
        }
        _tugrikSign = Builder(name = "TugrikSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(6.89f)
                lineToRelative(7.0f, -2.33f)
                verticalLineToRelative(2.11f)
                lineToRelative(-7.0f, 2.33f)
                verticalLineToRelative(2.33f)
                lineToRelative(7.0f, -2.33f)
                verticalLineToRelative(2.11f)
                lineToRelative(-7.0f, 2.33f)
                verticalLineToRelative(8.56f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.89f)
                lineToRelative(-7.0f, 2.33f)
                verticalLineToRelative(-2.11f)
                lineToRelative(7.0f, -2.33f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-7.0f, 2.33f)
                verticalLineToRelative(-2.11f)
                lineToRelative(7.0f, -2.33f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _tugrikSign!!
    }

private var _tugrikSign: ImageVector? = null
