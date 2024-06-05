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

public val Icons.Filled.LayerMinus: ImageVector
    get() {
        if (_layerMinus != null) {
            return _layerMinus!!
        }
        _layerMinus = Builder(name = "LayerMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.7f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 11.7f)
                verticalLineToRelative(-2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                verticalLineToRelative(2.332f)
                close()
                moveTo(23.944f, 7.231f)
                lineTo(12.0f, 0.064f)
                lineTo(0.056f, 7.23f)
                lineToRelative(11.944f, 7.166f)
                lineToRelative(11.944f, -7.166f)
                close()
                moveTo(14.0f, 19.699f)
                lineToRelative(-2.0f, 1.2f)
                lineTo(0.0f, 13.699f)
                verticalLineToRelative(2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(2.0f, -1.2f)
                verticalLineToRelative(-2.332f)
                close()
                moveTo(24.0f, 19.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _layerMinus!!
    }

private var _layerMinus: ImageVector? = null
