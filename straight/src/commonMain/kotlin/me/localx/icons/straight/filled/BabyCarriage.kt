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

public val Icons.Filled.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.861f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                curveTo(15.083f, 0.0f, 22.746f, 0.1f, 23.861f, 8.0f)
                close()
                moveTo(5.5f, 10.0f)
                lineTo(4.0f, 8.0f)
                arcTo(5.025f, 5.025f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineTo(8.0f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 2.4f, 9.2f)
                lineTo(4.0f, 11.333f)
                verticalLineTo(13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.865f)
                lineTo(9.257f, 19.129f)
                curveToRelative(-1.322f, -0.618f, -3.42f, 0.917f, -3.253f, 2.511f)
                arcToRelative(2.492f, 2.492f, 0.0f, true, false, 4.757f, -1.191f)
                lineTo(14.0f, 16.562f)
                lineToRelative(3.239f, 3.887f)
                arcTo(2.492f, 2.492f, 0.0f, true, false, 22.0f, 21.639f)
                curveToRelative(0.167f, -1.592f, -1.931f, -3.129f, -3.253f, -2.51f)
                lineTo(16.135f, 16.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
