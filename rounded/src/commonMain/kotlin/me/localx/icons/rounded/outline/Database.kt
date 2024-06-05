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

public val Icons.Outline.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.5f)
                arcToRelative(4.476f, 4.476f, 0.0f, false, false, -1.706f, -3.5f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, -2.794f, -8.0f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, -2.794f, 8.0f)
                arcToRelative(4.443f, 4.443f, 0.0f, false, false, 0.0f, 7.0f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, 2.794f, 8.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, 2.794f, -8.0f)
                arcToRelative(4.476f, 4.476f, 0.0f, false, false, 1.706f, -3.5f)
                close()
                moveTo(2.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                close()
                moveTo(4.5f, 14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
