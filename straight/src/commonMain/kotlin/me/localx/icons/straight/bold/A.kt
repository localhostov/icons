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

public val Icons.Bold.A: ImageVector
    get() {
        if (_a != null) {
            return _a!!
        }
        _a = Builder(name = "A", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.766f, 24.0f)
                horizontalLineToRelative(3.234f)
                lineTo(15.307f, 1.938f)
                curveToRelative(-0.596f, -1.195f, -1.797f, -1.938f, -3.133f, -1.938f)
                curveToRelative(-1.358f, 0.0f, -2.539f, 0.749f, -3.173f, 2.031f)
                lineTo(0.0f, 24.0f)
                horizontalLineTo(3.25f)
                lineToRelative(2.455f, -6.0f)
                horizontalLineToRelative(12.702f)
                lineToRelative(2.36f, 6.0f)
                close()
                moveTo(6.932f, 15.0f)
                lineTo(11.728f, 3.277f)
                curveToRelative(0.177f, -0.357f, 0.778f, -0.234f, 0.845f, -0.109f)
                lineToRelative(4.653f, 11.832f)
                horizontalLineTo(6.932f)
                close()
            }
        }
        .build()
        return _a!!
    }

private var _a: ImageVector? = null
