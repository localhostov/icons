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

public val Icons.Bold.TrashList: ImageVector
    get() {
        if (_trashList != null) {
            return _trashList!!
        }
        _trashList = Builder(name = "TrashList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.34f, 21.0f)
                horizontalLineToRelative(6.66f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.66f)
                curveToRelative(-1.807f, 0.0f, -3.338f, -1.41f, -3.487f, -3.21f)
                lineTo(1.62f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.631f, 6.0f)
                lineToRelative(1.212f, 14.541f)
                curveToRelative(0.021f, 0.262f, 0.235f, 0.459f, 0.497f, 0.459f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _trashList!!
    }

private var _trashList: ImageVector? = null
