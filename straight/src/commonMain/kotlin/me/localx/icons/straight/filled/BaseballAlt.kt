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

public val Icons.Filled.BaseballAlt: ImageVector
    get() {
        if (_baseballAlt != null) {
            return _baseballAlt!!
        }
        _baseballAlt = Builder(name = "BaseballAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.187f, 9.657f)
                arcToRelative(31.182f, 31.182f, 0.0f, false, true, -5.358f, 4.3f)
                curveToRelative(-0.364f, 0.231f, -0.775f, 0.482f, -1.2f, 0.74f)
                curveToRelative(-0.445f, 0.272f, -0.932f, 0.572f, -1.379f, 0.856f)
                lineTo(8.48f, 11.778f)
                curveToRelative(0.339f, -0.525f, 0.709f, -1.13f, 1.039f, -1.671f)
                lineToRelative(0.455f, -0.743f)
                arcToRelative(31.369f, 31.369f, 0.0f, false, true, 4.5f, -5.685f)
                lineTo(16.946f, 1.21f)
                arcTo(4.132f, 4.132f, 0.0f, true, true, 22.79f, 7.054f)
                close()
                moveTo(7.23f, 13.356f)
                lineTo(2.5f, 18.086f)
                lineTo(1.457f, 17.043f)
                lineTo(0.043f, 18.457f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(5.914f, 21.5f)
                lineToRelative(4.73f, -4.73f)
                close()
                moveTo(20.5f, 16.979f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 16.979f)
                close()
            }
        }
        .build()
        return _baseballAlt!!
    }

private var _baseballAlt: ImageVector? = null
