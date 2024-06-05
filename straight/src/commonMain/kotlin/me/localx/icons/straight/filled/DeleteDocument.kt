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

public val Icons.Filled.DeleteDocument: ImageVector
    get() {
        if (_deleteDocument != null) {
            return _deleteDocument!!
        }
        _deleteDocument = Builder(name = "DeleteDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.414f, 15.0f)
                lineTo(15.957f, 12.457f)
                lineTo(14.543f, 11.043f)
                lineTo(12.0f, 13.586f)
                lineTo(9.457f, 11.043f)
                lineTo(8.043f, 12.457f)
                lineTo(10.586f, 15.0f)
                lineTo(8.043f, 17.543f)
                lineTo(9.457f, 18.957f)
                lineTo(12.0f, 16.414f)
                lineTo(14.543f, 18.957f)
                lineTo(15.957f, 17.543f)
                close()
            }
        }
        .build()
        return _deleteDocument!!
    }

private var _deleteDocument: ImageVector? = null
