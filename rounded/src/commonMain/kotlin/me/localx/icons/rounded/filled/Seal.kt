package me.localx.icons.rounded.filled

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

public val Icons.Filled.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = Builder(name = "Seal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.036f)
                curveToRelative(-0.801f, 0.0f, -1.555f, -0.312f, -2.122f, -0.879f)
                lineToRelative(-2.157f, -2.157f)
                horizontalLineToRelative(-1.721f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-1.721f)
                lineToRelative(-2.158f, -2.158f)
                curveToRelative(-1.169f, -1.17f, -1.169f, -3.072f, 0.0f, -4.242f)
                lineToRelative(2.158f, -2.158f)
                verticalLineToRelative(-1.721f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.721f)
                lineToRelative(2.158f, -2.157f)
                curveToRelative(1.133f, -1.133f, 3.109f, -1.133f, 4.243f, 0.0f)
                lineToRelative(2.157f, 2.157f)
                horizontalLineToRelative(1.721f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.721f)
                lineToRelative(2.158f, 2.158f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.168f, 1.17f, 1.168f, 3.072f, 0.0f, 4.242f)
                lineToRelative(-2.158f, 2.158f)
                verticalLineToRelative(1.721f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.721f)
                lineToRelative(-2.158f, 2.157f)
                curveToRelative(-0.566f, 0.566f, -1.32f, 0.879f, -2.121f, 0.879f)
                close()
            }
        }
        .build()
        return _seal!!
    }

private var _seal: ImageVector? = null
