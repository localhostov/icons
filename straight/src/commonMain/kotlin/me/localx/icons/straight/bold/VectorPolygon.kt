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

public val Icons.Bold.VectorPolygon: ImageVector
    get() {
        if (_vectorPolygon != null) {
            return _vectorPolygon!!
        }
        _vectorPolygon = Builder(name = "VectorPolygon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 10.867f)
                lineToRelative(4.295f, -4.867f)
                horizontalLineToRelative(3.705f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 2.0f)
                lineTo(6.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.705f)
                lineToRelative(-4.295f, -4.867f)
                verticalLineToRelative(-2.266f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.176f)
                lineToRelative(-3.529f, 4.0f)
                horizontalLineToRelative(-3.647f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.647f)
                lineToRelative(3.529f, 4.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _vectorPolygon!!
    }

private var _vectorPolygon: ImageVector? = null
