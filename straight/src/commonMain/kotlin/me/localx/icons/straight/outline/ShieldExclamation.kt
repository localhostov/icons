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

public val Icons.Outline.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.793f, 23.708f)
                curveToRelative(2.16f, -0.868f, 9.207f, -4.28f, 9.207f, -11.717f)
                verticalLineToRelative(-6.524f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, -2.054f, -2.842f)
                lineToRelative(-7.946f, -2.635f)
                lineToRelative(-7.946f, 2.635f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, -2.054f, 2.842f)
                verticalLineToRelative(6.524f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.576f, 9.153f, 11.651f)
                lineToRelative(0.8f, 0.4f)
                close()
                moveTo(19.316f, 4.523f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.684f, 0.944f)
                verticalLineToRelative(6.524f)
                curveToRelative(0.0f, 6.183f, -6.087f, 9.112f, -7.953f, 9.862f)
                curveToRelative(-1.888f, -0.945f, -8.047f, -4.446f, -8.047f, -9.862f)
                verticalLineToRelative(-6.524f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.684f, -0.944f)
                lineToRelative(7.316f, -2.423f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
