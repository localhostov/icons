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

public val Icons.Bold.ArrowFromLeft: ImageVector
    get() {
        if (_arrowFromLeft != null) {
            return _arrowFromLeft!!
        }
        _arrowFromLeft = Builder(name = "ArrowFromLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.12f, 9.882f)
                lineTo(18.171f, 4.931f)
                lineTo(16.05f, 7.052f)
                lineTo(19.5f, 10.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.5f)
                lineToRelative(-3.449f, 3.45f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.95f, -4.95f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.12f, 9.882f)
                close()
            }
        }
        .build()
        return _arrowFromLeft!!
    }

private var _arrowFromLeft: ImageVector? = null
