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

public val Icons.Bold.HexagonExclamation: ImageVector
    get() {
        if (_hexagonExclamation != null) {
            return _hexagonExclamation!!
        }
        _hexagonExclamation = Builder(name = "HexagonExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.588f, 10.361f)
                lineToRelative(-4.059f, -7.565f)
                curveToRelative(-0.594f, -1.107f, -1.746f, -1.796f, -3.006f, -1.796f)
                lineTo(7.496f, 1.0f)
                curveToRelative(-1.257f, 0.0f, -2.408f, 0.687f, -3.002f, 1.79f)
                lineTo(0.415f, 10.36f)
                curveToRelative(-0.555f, 1.03f, -0.554f, 2.26f, 0.0f, 3.289f)
                lineToRelative(4.078f, 7.562f)
                curveToRelative(0.595f, 1.104f, 1.746f, 1.789f, 3.002f, 1.789f)
                horizontalLineToRelative(9.028f)
                curveToRelative(1.26f, 0.0f, 2.411f, -0.688f, 3.005f, -1.796f)
                lineToRelative(4.059f, -7.564f)
                curveToRelative(0.551f, -1.026f, 0.551f, -2.253f, 0.0f, -3.278f)
                close()
                moveTo(20.944f, 12.22f)
                lineToRelative(-4.059f, 7.565f)
                curveToRelative(-0.071f, 0.132f, -0.209f, 0.214f, -0.362f, 0.214f)
                lineTo(7.496f, 19.999f)
                curveToRelative(-0.152f, 0.0f, -0.291f, -0.082f, -0.362f, -0.213f)
                lineToRelative(-4.078f, -7.562f)
                curveToRelative(-0.075f, -0.139f, -0.075f, -0.305f, 0.0f, -0.442f)
                lineToRelative(4.079f, -7.569f)
                curveToRelative(0.071f, -0.132f, 0.209f, -0.214f, 0.362f, -0.214f)
                horizontalLineToRelative(9.027f)
                curveToRelative(0.153f, 0.0f, 0.292f, 0.082f, 0.362f, 0.214f)
                lineToRelative(4.06f, 7.566f)
                curveToRelative(0.074f, 0.138f, 0.074f, 0.302f, 0.0f, 0.44f)
                close()
                moveTo(10.5f, 5.999f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(10.5f, 14.999f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _hexagonExclamation!!
    }

private var _hexagonExclamation: ImageVector? = null
