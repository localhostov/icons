package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 12.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.171f, 1.342f)
                lineTo(8.453f, 22.2f)
                lineToRelative(2.8f, 1.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.488f, 0.0f)
                lineToRelative(2.8f, -1.6f)
                lineToRelative(3.282f, 1.642f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 22.5f)
                verticalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 15.5f, 0.0f)
                close()
                moveTo(18.0f, 20.073f)
                lineToRelative(-1.83f, -0.915f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.415f, 0.039f)
                lineTo(12.0f, 20.772f)
                lineTo(9.245f, 19.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.415f, -0.039f)
                lineTo(6.0f, 20.073f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 5.5f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
