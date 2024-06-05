package me.localx.icons.straight.filled

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

public val Icons.Filled.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                verticalLineToRelative(-4.414f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
