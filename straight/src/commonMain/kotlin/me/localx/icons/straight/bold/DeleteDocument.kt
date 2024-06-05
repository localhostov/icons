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

public val Icons.Bold.DeleteDocument: ImageVector
    get() {
        if (_deleteDocument != null) {
            return _deleteDocument!!
        }
        _deleteDocument = Builder(name = "DeleteDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.061f, 12.061f)
                lineToRelative(-1.94f, 1.939f)
                lineToRelative(1.94f, 1.939f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(-1.939f, -1.94f)
                lineToRelative(-1.939f, 1.94f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(1.94f, -1.939f)
                lineToRelative(-1.94f, -1.939f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(1.939f, 1.94f)
                lineToRelative(1.939f, -1.94f)
                close()
                moveTo(22.0f, 5.879f)
                verticalLineToRelative(18.121f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(11.121f)
                close()
                moveTo(19.0f, 21.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _deleteDocument!!
    }

private var _deleteDocument: ImageVector? = null
