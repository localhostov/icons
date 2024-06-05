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

public val Icons.Bold.LandLayers: ImageVector
    get() {
        if (_landLayers != null) {
            return _landLayers!!
        }
        _landLayers = Builder(name = "LandLayers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 19.001f)
                lineToRelative(12.0f, -7.2f)
                verticalLineToRelative(3.499f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 15.3f)
                verticalLineToRelative(-3.499f)
                lineToRelative(12.0f, 7.2f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(1.099f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 10.099f)
                verticalLineToRelative(-1.099f)
                lineTo(12.0f, 1.8f)
                lineToRelative(12.0f, 7.2f)
                close()
                moveTo(12.0f, 5.299f)
                lineToRelative(-2.529f, 1.517f)
                lineToRelative(2.571f, 1.543f)
                lineToRelative(2.529f, -1.517f)
                lineToRelative(-2.571f, -1.543f)
                close()
                moveTo(4.916f, 9.549f)
                lineToRelative(2.571f, 1.543f)
                lineToRelative(2.611f, -1.567f)
                lineToRelative(-2.571f, -1.543f)
                lineToRelative(-2.612f, 1.567f)
                close()
                moveTo(12.0f, 13.799f)
                lineToRelative(2.611f, -1.567f)
                lineToRelative(-2.569f, -1.542f)
                lineToRelative(-2.611f, 1.567f)
                lineToRelative(2.569f, 1.541f)
                close()
                moveTo(19.084f, 9.549f)
                lineToRelative(-2.57f, -1.542f)
                lineToRelative(-2.529f, 1.518f)
                lineToRelative(2.57f, 1.542f)
                lineToRelative(2.529f, -1.517f)
                close()
            }
        }
        .build()
        return _landLayers!!
    }

private var _landLayers: ImageVector? = null
