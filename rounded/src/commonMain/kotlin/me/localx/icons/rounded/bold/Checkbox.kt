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

public val Icons.Bold.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.667f, 512.0f)
                horizontalLineTo(117.333f)
                curveTo(52.561f, 511.929f, 0.071f, 459.439f, 0.0f, 394.667f)
                verticalLineTo(117.333f)
                curveTo(0.071f, 52.561f, 52.561f, 0.071f, 117.333f, 0.0f)
                horizontalLineToRelative(277.333f)
                curveTo(459.439f, 0.071f, 511.929f, 52.561f, 512.0f, 117.333f)
                verticalLineToRelative(277.333f)
                curveTo(511.929f, 459.439f, 459.439f, 511.929f, 394.667f, 512.0f)
                close()
                moveTo(117.333f, 64.0f)
                curveTo(87.878f, 64.0f, 64.0f, 87.878f, 64.0f, 117.333f)
                verticalLineToRelative(277.333f)
                curveTo(64.0f, 424.122f, 87.878f, 448.0f, 117.333f, 448.0f)
                horizontalLineToRelative(277.333f)
                curveTo(424.122f, 448.0f, 448.0f, 424.122f, 448.0f, 394.667f)
                verticalLineTo(117.333f)
                curveTo(448.0f, 87.878f, 424.122f, 64.0f, 394.667f, 64.0f)
                horizontalLineTo(117.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.229f, 379.456f)
                curveToRelative(-13.462f, 0.009f, -26.368f, -5.368f, -35.84f, -14.933f)
                lineToRelative(-63.723f, -63.616f)
                curveToRelative(-12.501f, -12.493f, -12.507f, -32.754f, -0.014f, -45.255f)
                curveToRelative(0.005f, -0.005f, 0.01f, -0.01f, 0.014f, -0.015f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.496f, -12.492f, 32.752f, -12.492f, 45.248f, 0.0f)
                lineToRelative(54.315f, 54.293f)
                lineToRelative(153.856f, -153.856f)
                curveToRelative(12.496f, -12.492f, 32.752f, -12.492f, 45.248f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.501f, 12.493f, 12.507f, 32.754f, 0.014f, 45.255f)
                curveToRelative(-0.005f, 0.005f, -0.01f, 0.01f, -0.014f, 0.014f)
                lineTo(242.048f, 364.629f)
                curveTo(232.566f, 374.154f, 219.669f, 379.493f, 206.229f, 379.456f)
                close()
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
