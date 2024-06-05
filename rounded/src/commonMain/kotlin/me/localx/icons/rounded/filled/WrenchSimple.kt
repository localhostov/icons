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

public val Icons.Filled.WrenchSimple: ImageVector
    get() {
        if (_wrenchSimple != null) {
            return _wrenchSimple!!
        }
        _wrenchSimple = Builder(name = "WrenchSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 1.076f)
                verticalLineTo(7.83f)
                curveToRelative(0.0f, 1.624f, -1.216f, 3.081f, -2.839f, 3.166f)
                curveToRelative(-1.73f, 0.091f, -3.161f, -1.285f, -3.161f, -2.996f)
                verticalLineTo(1.076f)
                curveToRelative(0.0f, -0.804f, -0.844f, -1.304f, -1.567f, -0.953f)
                curveTo(3.645f, 1.962f, 1.0f, 5.81f, 1.0f, 10.073f)
                curveToRelative(0.0f, 4.146f, 2.295f, 7.898f, 5.988f, 9.792f)
                curveToRelative(0.614f, 0.315f, 1.012f, 0.997f, 1.012f, 1.736f)
                verticalLineToRelative(1.398f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.398f)
                curveToRelative(0.0f, -0.739f, 0.397f, -1.421f, 1.012f, -1.736f)
                curveToRelative(3.693f, -1.894f, 5.988f, -5.646f, 5.988f, -9.792f)
                curveTo(23.0f, 5.81f, 20.355f, 1.962f, 16.567f, 0.123f)
                curveToRelative(-0.723f, -0.351f, -1.567f, 0.15f, -1.567f, 0.953f)
                close()
            }
        }
        .build()
        return _wrenchSimple!!
    }

private var _wrenchSimple: ImageVector? = null
