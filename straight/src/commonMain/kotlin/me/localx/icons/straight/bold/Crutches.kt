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

public val Icons.Bold.Crutches: ImageVector
    get() {
        if (_crutches != null) {
            return _crutches!!
        }
        _crutches = Builder(name = "Crutches", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.968f, 21.718f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-5.282f, -5.282f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(5.282f, 5.282f)
                close()
                moveTo(20.933f, 10.54f)
                lineToRelative(-5.446f, 5.446f)
                curveToRelative(-1.914f, 1.915f, -4.565f, 3.014f, -7.274f, 3.014f)
                horizontalLineToRelative(-1.091f)
                lineToRelative(-4.843f, 4.843f)
                lineTo(0.157f, 21.722f)
                lineToRelative(4.843f, -4.843f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0.0f, -1.032f, 0.151f, -2.041f, 0.442f, -3.001f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-0.917f, 0.917f)
                lineTo(0.154f, 9.333f)
                lineTo(9.455f, 0.032f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-0.911f, 0.911f)
                lineToRelative(1.399f, 1.399f)
                lineToRelative(1.395f, -1.395f)
                lineToRelative(-0.917f, -0.917f)
                lineTo(14.663f, 0.029f)
                lineToRelative(9.302f, 9.301f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-0.911f, -0.911f)
                close()
                moveTo(6.828f, 9.93f)
                curveToRelative(0.349f, -0.502f, 0.745f, -0.976f, 1.186f, -1.417f)
                lineToRelative(1.929f, -1.929f)
                lineToRelative(-1.399f, -1.399f)
                lineToRelative(-3.231f, 3.231f)
                lineToRelative(1.514f, 1.514f)
                close()
                moveTo(8.212f, 15.999f)
                curveToRelative(1.413f, 0.0f, 2.804f, -0.422f, 3.98f, -1.187f)
                lineToRelative(-3.009f, -3.009f)
                curveToRelative(-0.77f, 1.174f, -1.183f, 2.547f, -1.183f, 3.984f)
                verticalLineToRelative(0.211f)
                horizontalLineToRelative(0.212f)
                close()
                moveTo(18.811f, 8.418f)
                lineToRelative(-3.231f, -3.231f)
                lineToRelative(-4.385f, 4.385f)
                lineToRelative(3.231f, 3.231f)
                lineToRelative(4.386f, -4.385f)
                close()
            }
        }
        .build()
        return _crutches!!
    }

private var _crutches: ImageVector? = null
