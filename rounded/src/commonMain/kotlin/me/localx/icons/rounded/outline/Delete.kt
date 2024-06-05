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

public val Icons.Outline.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                horizontalLineToRelative(-9.044f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, -3.946f, 1.931f)
                lineToRelative(-5.8f, 7.455f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.228f)
                lineToRelative(5.8f, 7.455f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 3.946f, 1.931f)
                horizontalLineToRelative(9.044f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-9.044f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, -2.368f, -1.158f)
                lineToRelative(-5.321f, -6.842f)
                lineToRelative(5.321f, -6.842f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, 2.368f, -1.158f)
                horizontalLineToRelative(9.044f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(17.207f, 10.207f)
                lineTo(15.414f, 12.0f)
                lineTo(17.207f, 13.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.793f, -1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.793f, -1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
